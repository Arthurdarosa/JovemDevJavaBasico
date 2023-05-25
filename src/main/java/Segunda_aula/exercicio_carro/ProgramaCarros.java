import java.util.*;
public class ProgramaCarros {
    private static List<Carro> carros = new ArrayList<Carro>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarCarro(scanner);
                    break;
                case 2:
                    listarCarrosPorPeriodo(scanner);
                    break;
                case 3:
                    listarCarrosPorMarca(scanner);
                    break;
                case 4:
                    listarCarrosPorCor(scanner);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            System.out.println();
        } while (opcao != 5);
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Cadastrar Carro");
        System.out.println("2 - Listar carros por período de fabricação");
        System.out.println("3 - Listar carros por marca");
        System.out.println("4 - Listar carros por cor");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void cadastrarCarro(Scanner scanner) {
        System.out.println("Cadastro de Carro");
        
        System.out.print("Marca: ");
        String marca = scanner.next();
        
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        
        System.out.println("Cores disponíveis:");
        for (Cor cor : Cor.values()) {
            System.out.println(cor.ordinal() + " - " + cor.name());
        }
        
        System.out.print("Cor (selecione o número correspondente): ");
        int corNumero = scanner.nextInt();
        Cor cor = Cor.values()[corNumero];
        
        Carro carro = new Carro(marca, ano, cor);
        carros.add(carro);
        
        System.out.println("Carro cadastrado com sucesso!");
    }
    
    private static void listarCarrosPorPeriodo(Scanner scanner) {
        System.out.println("Listagem de Carros por Período de Fabricação");
        
        System.out.print("Ano inicial: ");
        int anoInicial = scanner.nextInt();
        
        System.out.print("Ano final: ");
        int anoFinal = scanner.nextInt();
        
        List<Carro> carrosFiltrados = new ArrayList<Carro>();
        
        for (Carro carro : carros) {
            int ano = carro.getAno();
            if (ano >= anoInicial && ano <= anoFinal) {
                carrosFiltrados.add(carro);
            }
        }
        
        exibirCarros(carrosFiltrados);
    }
    
    private static void listarCarrosPorMarca(Scanner scanner) {
        System.out.println("Listagem de Carros por Marca");
        
        System.out.print("Marca: ");
        String marca = scanner.next().toUpperCase();
        
        List<Carro> carrosFiltrados = new ArrayList<Carro>();
        
        for (Carro carro : carros) {
            if (carro.getMarca().equals(marca)) {
                carrosFiltrados.add(carro);
            }
        }
        
        exibirCarros(carrosFiltrados);
    }
    
    private static void listarCarrosPorCor(Scanner scanner) {
        System.out.println("Listagem de Carros por Cor");
        
        System.out.println("Cores disponíveis:");
        for (Cor cor : Cor.values()) {
            System.out.println(cor.ordinal() + " - " + cor.name());
        }
        
        System.out.print("Cor (selecione o número correspondente): ");
        int corNumero = scanner.nextInt();
        Cor cor = Cor.values()[corNumero];
        
        List<Carro> carrosFiltrados = new ArrayList<Carro>();
        
        for (Carro carro : carros) {
            if (carro.getCor() == cor) {
                carrosFiltrados.add(carro);
            }
        }
        
        exibirCarros(carrosFiltrados);
    }
    
    private static void exibirCarros(List<Carro> carros) {
        System.out.println("Lista de Carros:");
        
        for (Carro carro : carros) {
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Cor: " + carro.getCor());
            System.out.println();
        }
        
        double percentual = (double) carros.size() / ProgramaCarros.carros.size() * 100;
        System.out.println("Percentual em relação ao total cadastrado: " + percentual + "%");
    }
}