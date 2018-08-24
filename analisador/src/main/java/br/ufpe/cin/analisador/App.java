package br.ufpe.cin.analisador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		new MiniJava(new BufferedReader(new InputStreamReader(System.in))).yylex();
	}
}