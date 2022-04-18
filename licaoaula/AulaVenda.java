package licaoaula;
import java.util.ArrayList;

public class AulaVenda {
    public static void main(String[] args) {

        int option = 0;

        Client client;
        ArrayList<Client> clients = new ArrayList<Client>();

        Clerk clerk;
        ArrayList<Clerk> clerks = new ArrayList<Clerk>();

        Product product;
        ArrayList<Product> products = new ArrayList<Product>();
        
        do{
            System.out.println("\n -- VENDAS -- \n");
            System.out.println("1 - Cadastrar Clientes");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Vendedor");
            System.out.println("4 - Listar Vendedor");
            System.out.println("5 - Cadastrar Produto");
            System.out.println("6 - Listar Produto");
            System.out.println("0 - Sair \n");
            option = Console.readInt("Digite uma opção: ");

            switch (option) {
                case 1:
                    client = new Client();
                    System.out.println("\n -- CADASTRO DE CLIENTE: --\n");
                    client.setName(Console.readString("Digite o nome para o cliente: "));
                    client.setCpf(Console.readString("Digite o CPF para o cliente: "));
                    clients.add(client);
                    System.out.println("\n - Cliente Cadastrado - \n");
                    break;
                case 2:
                    System.out.println("\n -- LISTAR CLIENTES: -- \n");
                    for(Client registeredClient : clients){
                        System.out.println(registeredClient);
                        //possível fazer esta mesma função para mostrar o cliente
                        //utilizando um contador, exemplo abaixo
                        //for(int i = 0; i < clients.size(); i++){                        
                        //    System.out.println(clients.get(i));
                        //}
                    }
                    break;
                case 3:
                    clerk = new Clerk();
                    System.out.println("\n -- CADASTRO DE VENDEDOR: -- \n");
                    clerk.setClerkName(Console.readString("Digite o nome do Vendedor: "));
                    clerks.add(clerk);
                    System.out.println("\n - Vendedor Cadastrado - \n");
                    break;
                case 4:
                    System.out.println("\n -- LISTAR VENDEDORES: -- \n");
                    for(Clerk registeredClerk : clerks){
                        System.out.println(registeredClerk);
                    }
                    break;
                case 5:
                    product = new Product();
                    System.out.println("\n -- CADASTRO DE PRODUTO: -- \n");
                    product.setProductName(Console.readString("Digite o nome do Produto: "));
                    product.setProductQuantity(Console.readInt("Digite a quantidade de itens: "));
                    products.add(product);
                    System.out.println("\n - Produto Cadastrado - \n");
                    break;
                case 6:
                    System.out.println("\n -- LISTAR PRODUTOS -- \n");
                    for(Product registeredProduct : products){
                        System.out.println(registeredProduct);
                    }
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n -- OPÇÃO INVÁLIDA -- \n");

            }
        } while (option != 0);
    }
}