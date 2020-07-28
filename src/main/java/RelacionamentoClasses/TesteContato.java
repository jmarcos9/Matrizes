package RelacionamentoClasses;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Marcos");
        //contato.setEndereco("Candeias");
        //contato.setTelefone("81 9999 9999");

        //relacionamento tem um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Ulisses");
        end.setNumero("4520");
        end.setComplemento("Casa 4");
        end.setCidade("Jaboatão");
        end.setEstado("PE");
        end.setCep("54470-030");

        contato.setEndereco(end);

        //relacionamento tem um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("81");
        telefone.setNumero("99834-9081");

        //contato.setTelefones(telefone);

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("81");
        telefone2.setNumero("3468-9215");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefones() != null){
            System.out.printf("%s: (%s) %s ",contato.getTelefones().getTipo(),contato.getTelefones().getDdd(),
            contato.getTelefones().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null ){
            for (Telefone t: contato.getTelefones()) {
                System.out.printf("%s: (%s) %s \n",t.getTipo(),t.getDdd(), t.getNumero());

            }
        }



    }

}
