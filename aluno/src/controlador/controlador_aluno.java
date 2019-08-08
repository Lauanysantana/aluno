/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.alunoDao;
import javax.swing.JOptionPane;
import modelo.aluno;
import tela.manutencao.Manutencao_aluno;

/**
 *
 * @author Administrador
 */
public class controlador_aluno {
public static void inserir(Manutencao_aluno man){
        aluno objeto = new aluno();
        objeto.setnome(man.jtfnome.getText());
        objeto.setsobrenome(man.jtfsobrenome.getText());
        objeto.setcodigo(man.jtfcodigo.getText());
        
        boolean resultado = alunoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(Manutencao_aluno aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param aThis
     */
   //To change body of generated methods, choose Tools | Templates.
    }

   
    

