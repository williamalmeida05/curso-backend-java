package br.com.will.adapter;

import java.io.File;

public class GoogleDriveAdapter implements PersistenciaArquivos{

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googleDrive) {
        this.googleDrive = googleDrive;
    }

    private
    @Override
    public void gravar(File file) {
        googleDrive.get(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        byte[] file = googleDrive.get(caminho);
        return new File(String.valueOf(file.getClass()));
    }
}
