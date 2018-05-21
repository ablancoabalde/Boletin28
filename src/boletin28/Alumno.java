package boletin28;

import javax.swing.JOptionPane;

public class Alumno {

    private String nome;
    private Integer nota;
    private Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nome, Integer nota, String direcc, Integer num) {
        this.nome=nome;
        this.nota=nota;
        enderezo=new Enderezo(direcc, num);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota=nota;
    }

    @Override
    public String toString() {
        return "Alumno{"+"nome="+nome+", nota="+nota+'}';
    }

    public void modNota() {

        this.setNota(Integer.parseInt(JOptionPane.showInputDialog("Nueva nota")));
    }

    class Enderezo {

        private String rua;
        private Integer num;

        public Enderezo() {
        }

        public Enderezo(String rua, Integer num) {
            this.rua=rua;
            this.num=num;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua=rua;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num=num;
        }

        @Override
        public String toString() {
            return "Enderezo{"+"rua="+rua+", num="+num+'}';
        }

        public void amosar() {
            System.out.println(Alumno.this.toString()+Alumno.Enderezo.this.toString());

        }
        

    }

    public void iamosar() {

        enderezo.amosar();

    }
    
    public void modEnderezo(){
        
        enderezo.setRua(JOptionPane.showInputDialog("Nueva rua"));
        enderezo.setNum(Integer.parseInt(JOptionPane.showInputDialog("Nuevo num")));
    }

}
