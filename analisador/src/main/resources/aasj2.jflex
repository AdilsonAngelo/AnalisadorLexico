package br.ufpe.cin.if688.analisador;

%%

/* N�o altere as configura��es a seguir */

%line
%column
%unicode
//%debug
%public
%standalone
%class MiniJava
%eofclose

/* Insira as regras l�xicas abaixo */

%%

[ \n\t\r\f] { /**/ }

("//" [^\r\n]*|"/*"~"*/")(\r|\n|\r\n) { /**/ }

boolean|class|public|extends|static|void|main|String|int|while|if|else|return|length|true|false|this|new|System.out.println { System.out.println("token gerado foi um reservado: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }

";"|"."|","|"="|"("|")"|"{"|"}"|"["|"]" { System.out.println("token gerado foi um delimitador: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }

"&&"|"<"|"=="|"!="|"+"|"-"|"*"|"!" { System.out.println("token gerado foi um operador: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }

([a-zA-Z]|"_")\w* { System.out.println("token gerado foi um id: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }

([1-9]\d*)|0 { System.out.println("token gerado foi um integer: '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }

/* Insira as regras l�xicas no espa�o acima */     
     
. { throw new RuntimeException("Caractere ilegal! '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }