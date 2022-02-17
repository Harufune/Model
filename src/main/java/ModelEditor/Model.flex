// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import psi.ModelTypes;
import com.intellij.psi.TokenType;

%%

%class ModelLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
  public ModelLexer(){
      this((java.io.Reader)null);
  }
%}

CHANNEL="channel"
REF = "ref"
IN = "in"
OUT ="out"
CRLF=\R
LBRACE="{"
RBRACE="}"
LBRACKET="("
RBRACKET=")"
CHANNEL_NAME=[^==\ \n\t\f\\{}()]
COMMA=","
SYMBOL=[^==\ \n\t\f\\{},()+\-*/]
WHITE_SPACE=[\ \n\t\f]
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
EQUALS="=="
OPERATOR=[+\-*/]
//CHARACTER=[^==\ \n\t\f\\] | "\\ "
//COMMA2=[^\,]
//LHS=[^==\ \n\t\f\\{},()]
//RHS=[^==\ \n\t\f\\{},()]
//FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
//VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
//KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%states WAITING_SPACE,WAITING_PORT,INOUT,WAITING_LHS,WAITING_RHS,REF,WAITING_RBRACE
%%
<YYINITIAL>{
      {END_OF_LINE_COMMENT}   {yybegin(YYINITIAL);return ModelTypes.COMMENT;}
      {CHANNEL}               {yybegin(WAITING_SPACE);return ModelTypes.CHANNEL;}
      {CHANNEL_NAME}+         {yybegin(YYINITIAL);return ModelTypes.CHANNEL_NAME;}
      {WHITE_SPACE}          {yybegin(YYINITIAL);return TokenType.WHITE_SPACE;}
      {CRLF}*                 {yybegin(YYINITIAL);return ModelTypes.CRLF;}
      {LBRACE}{CRLF}          {yybegin(WAITING_RBRACE);return ModelTypes.LBRACE;}
}
<WAITING_SPACE>  {WHITE_SPACE}+          {yybegin(YYINITIAL);return TokenType.WHITE_SPACE;}

<WAITING_RBRACE>{
      {RBRACE}                  {yybegin(YYINITIAL);     return ModelTypes.RBRACE;}
      {IN}                      {yybegin(WAITING_RBRACE);return ModelTypes.IN;}
      {OUT}                     {yybegin(WAITING_RBRACE);return ModelTypes.OUT;}
      {REF}                     {yybegin(WAITING_RBRACE);return ModelTypes.REF;}
      {SYMBOL}+                 {yybegin(WAITING_RBRACE);return ModelTypes.SYMBOL;}
      {RBRACKET}                {yybegin(WAITING_RBRACE);return ModelTypes.RBRACKET;}
      {LBRACKET}                {yybegin(WAITING_RBRACE);return ModelTypes.LBRACKET;}
      {COMMA}                   {yybegin(WAITING_RBRACE);return ModelTypes.COMMA;}
      {EQUALS}                  {yybegin(WAITING_RBRACE);return ModelTypes.EQUALS;}
      {OPERATOR}                {yybegin(WAITING_RBRACE);return  ModelTypes.OPERATOR;}
      {CRLF}{WHITE_SPACE}*      {yybegin(WAITING_RBRACE);return ModelTypes.CRLF;}
      {WHITE_SPACE}+            {yybegin(WAITING_RBRACE);return TokenType.WHITE_SPACE;}
}

