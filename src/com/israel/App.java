package com.israel;

import javax.swing.JOptionPane;

import com.israel.dao.ClienteMapDAO;
import com.israel.dao.IClienteDAO;

public class App {
    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) throws Exception {
         iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
}
