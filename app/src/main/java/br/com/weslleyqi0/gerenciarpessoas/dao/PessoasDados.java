package br.com.weslleyqi0.gerenciarpessoas.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Weslley on 01/04/2017.
 */

    public class PessoasDados extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "Pessoa.db";
    private static final String TABELA = "pessoas";
    private static final String ID = "_id";
    private static final String PRIMEIRONOME = "primeironome";
    private static final String SEGUNDONOME = "segundonome";
    private static final String ULTIMONOME = "ultimonome";
    private static final int VERSAO = 1;

    public PessoasDados(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
