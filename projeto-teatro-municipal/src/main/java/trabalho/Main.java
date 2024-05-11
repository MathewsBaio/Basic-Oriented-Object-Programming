package trabalho;

import trabalho.models.Assinante;
import trabalho.models.evento.*;
import trabalho.models.Funcionario;
import trabalho.models.Cliente;
import trabalho.models.Teatro;
import trabalho.models.pag.Ingresso;
import trabalho.models.stream.Midia;
import trabalho.models.stream.Streaming;
import trabalho.models.sup.Data;
import trabalho.models.sup.Endereco;

import java.util.Scanner;

public class Main {
    static Scanner readLine = new Scanner(System.in);

    public static void main(String[] args) {

        Teatro teatro = cadastrarTeatro(cadastrarStreaming());
        inicializarEventos(teatro);

        System.out.println(teatro.getEventos().get(0).getAssentosPA().size());

        System.out.println("############# CINE-THEATRO CENTRAL ################");

        while (true) {

            menuInicial();
            int num = readLine.nextInt();

            if (num == 1) {
                while (true) {
                    menuCliente();
                    int numCliente = readLine.nextInt();

                    if (numCliente == 1) {
                        comprarIngresso(); // to do
                    } else if (numCliente == 2) {
                        procuraIngressos(); // to do
                    } else if (numCliente == 3) {
                        cadastrarAssinante(); // to do
                    } else if (numCliente == 4) {
                        while(true) {
                            menuAssinante();
                            int numAssinante = readLine.nextInt();

                            if (numAssinante == 1) {
                                printCatalogo(); // to do
                            } else if (numAssinante == 2) {
                                printEventosBroadcast(); // to do
                            } else if (numAssinante == 3) {
                                comprarIngresso(); // to do
                            } else if (numAssinante == 4) {
                                printAssinatura(); // to do
                            } else if (numAssinante == 5) {
                                break;
                            }
                        }
                    } else if (numCliente == 5) {
                        System.out.println("Obrigado por usar nossos serviços!");
                        break;
                    }
                }
            } else if (num == 2) {
                while (true) {

                    menuFunc();
                    int numFuncionario = readLine.nextInt();

                    if (numFuncionario == 1) {
                        cadastrarEvento(teatro);
                    } else if (numFuncionario == 2) {
                        criarMidia(teatro);
                    } else if (numFuncionario == 3) {
                        while (true) {
                            venderIngresso(teatro); // to do
                            System.out.println(menuContinuar("de venda"));
                            int numCont = readLine.nextInt();

                            if (numCont == 1) {
                                System.out.println();
                            } else if (numCont == 2) {
                                break;
                            }
                        }
                    } else if (numFuncionario == 4) {
                        consultarEvento(); // to do
                    } else if (numFuncionario == 5) {
                        printCatalogo(); // to do
                    } else if (numFuncionario == 6) {

                        while (true) {

                            menuAdmAssentos(); // to do
                            int numAssentos = readLine.nextInt();

                        }

                    } else if (numFuncionario == 7) {

                        while (true) {

                            menuRelatorios(); // to do
                            int numRelatorio = readLine.nextInt();
                            
                        }

                    } else if (numFuncionario == 8) {
                        break;
                    }
                }
            } else if (num == 3) {
                System.out.println("Obrigado por usar nossos serviços!");
                break;
            }
        }

    }

    private static void venderIngresso(Teatro teatro) {
        System.out.println("### Venda de Ingresso Presencial");
        Ingresso ig = new Ingresso();

        System.out.println("Nome do cliente: ");
        readLine.nextLine();
        String nomeCliente = readLine.nextLine();
        ig.setComprador(new Cliente(nomeCliente));

        printEventosEmCartaz(teatro);
        System.out.println("Nome do evento escolhido: ");

//        readLine.nextLine();
//        readLine.nextLine();
        String tit = readLine.nextLine();

        Evento ev = teatro.procurarEvento(tit);
        int numAs;

        while(true){
            menuPlateia(ev);
            int num = readLine.nextInt();
            if (num == 1 && ev.isPaDisponivel()) {

                printAssentosDisponiveisPA(ev);
                System.out.println();

                System.out.println("Número do assento escolhido: ");
                numAs = readLine.nextInt();

                if(ev.procurarAssentoPA(numAs).getIngresso() != null) {

                    System.out.println("Este assento já foi reservado!");

                } else if (ev.procurarAssentoPA(numAs).getIngresso() == null) {

                    ig.setAssento(ev.getAssentosPA().get(numAs - 1));
                    ev.getAssentosPA().get(numAs - 1).setIngresso(ig);

                    System.out.println("### Assento PA-" +  ev.procurarAssentoPA(numAs).getNumero() +
                            " reservado com sucesso!");
                    System.out.println();
                }
            } else if (num == 2) {
                printAssentosDisponiveisPB(ev);
                System.out.println();

                System.out.println("Número do assento escolhido: ");
                numAs = readLine.nextInt();

                ig.setAssento(ev.getAssentosPB().get(numAs - 1));
                ev.getAssentosPB().get(numAs - 1).setIngresso(ig);

            } else if (num == 3) {
                printAssentosDisponiveisBN(ev);
                System.out.println();

                System.out.println("Número do assento escolhido: ");
                numAs = readLine.nextInt();

                ig.setAssento(ev.getAssentosBN().get(numAs - 1));
                ev.getAssentosBN().get(numAs - 1).setIngresso(ig);

            } else if (num == 4) {
                printAssentosDisponiveisCA(ev);
                System.out.println();

                System.out.println("Número do assento escolhido: ");
                numAs = readLine.nextInt();

                ig.setAssento(ev.getAssentosCA().get(numAs - 1));
                ev.getAssentosCA().get(numAs - 1).setIngresso(ig);

            }
            System.out.println(menuContinuar("de selecionar assentos"));
            int numCont = readLine.nextInt();

            if (numCont == 1) {
                System.out.println();
            } else if (numCont == 2) {
                break;
            }
        }
    }

    private static String menuContinuar(String str) {
        String menu = "### Deseja repetir a operação " + str + "?\n";
        menu += "1 - Sim\n";
        menu += "2 - Retornar\n";

        return menu;
    }

    private static void menuPlateia(Evento ev) {
        System.out.println("### Selecione a Plateia Desejada");
        System.out.println("1 - Plateia A" + " : : " + "R$ " + ev.getAssentosPA().get(0).valorIngresso() + ",00");
        System.out.println("2 - Plateia B" + " : : " + "R$ " + ev.getAssentosPB().get(0).valorIngresso() + ",00");
        System.out.println("3 - Balcão Nobre" + " : : " + "R$ " + ev.getAssentosBN().get(0).valorIngresso() + ",00");
        System.out.println("4 - Camarote" + " : : " + "R$ " + ev.getAssentosCA().get(0).valorIngresso() + ",00");
    }

    private static void printEventosEmCartaz(Teatro teatro) {
        System.out.println("### Eventos Em Cartaz");
        int count = 1;
        for (Evento ev : teatro.getEventos()) {
            if (!ev.getData().isPassado()) {
                System.out.println(count++ + " - " + ev.getTitulo() + " - " + ev.getData().toString() +
                        " " + ev.getHorario() + "\n" + ev.getResumo());
            }
        }
    }

    private static void consultarEvento() {
    }

    private static void criarMidia(Teatro teatro) {
        System.out.println("### Cadastro de Nova Mĩdia");
        printEventosTerminados(teatro); // Tratar situação em que não há eventos disponiveis
        System.out.println("Nome do evento: ");

        readLine.nextLine();
        String tit = readLine.nextLine();


        Evento ev = teatro.procurarEvento(tit);

        if(ev != null) {
            Midia md = new Midia(ev.getTitulo(), ev.getResumo(),
                    ev.getOrganizador(), teatro.getPlataformaStream());

            teatro.getPlataformaStream().addMidia(md);

            System.out.println("### " + md.getTitulo() + "Adicionado ao catálogo da " +
                    teatro.getPlataformaStream().getNome());
        } else {
            System.out.println("Evento não existe ou seu nome foi digitado incorretamente! ");
        }
    }

    private static void printEventosTerminados(Teatro teatro) {
        System.out.println("### Eventos Disponiveis");
        int count = 1;
        for (Evento ev : teatro.getEventos()) {
            if (ev.getData().isPassado() && ev.isBroadcasted() &&
                    teatro.getPlataformaStream().procuraMidia(ev.getTitulo()) == null) {
                System.out.println(count++ + " - " + ev.getTitulo());
            }
        }
    }

    private static void cadastrarEvento(Teatro teatro) {
        Evento ev = new Evento(teatro);
        System.out.println("### Cadastro de Novo Evento");
        System.out.println("Insira o título do evento: ");
        ev.setTitulo(readLine.nextLine());
        readLine.nextLine();
        System.out.println("Insira o resumo do evento: ");
        ev.setResumo(readLine.nextLine());
        System.out.println("Insira o organizador do evento: ");
        ev.setOrganizador(readLine.nextLine());
        System.out.println("Insira a data do evento: ");
        System.out.println("dia:");
        int dia = readLine.nextInt();
        System.out.println("mês:");
        int mes = readLine.nextInt();
        System.out.println("ano");
        int ano = readLine.nextInt();
        ev.setData(new Data(dia, mes, ano));
        System.out.println("Horário do evento: ");
        ev.setHorario(readLine.next());
        System.out.println("Insira do valor do ingresso básico evento: ");
        ev.setValor(readLine.nextDouble());
        System.out.println("O evento será transmitido ao vivo? (S) ou (N)");
        String b = readLine.next();
        if(b.toUpperCase().equals("S")) {
            ev.setBroadcasted(true);
        } else if (b.toUpperCase().equals("N")) {
            ev.setBroadcasted(false);
        }

        teatro.addEvento(ev);

        System.out.println("### Evento Cadastrado com sucesso!");
        System.out.println();
    }

    private static void menuAdmAssentos() {
    }

    private static void cadastrarAssinante() {
    }

    private static void procuraIngressos() {
    }

    private static void printAssinatura() {
    }

    private static void comprarIngresso() {
    }

    private static void printEventosBroadcast() {
    }

    private static void printCatalogo() {
    }

    private static void menuCliente() {
        System.out.println("############################");
        System.out.println("### Bem vindo ao Cine-Theatro Central!");
        System.out.println("############################");
        System.out.println("1 - Comprar Ingresso");
        System.out.println("2 - Meus Ingressos");
        System.out.println("3 - Realizar Assinatura");
        System.out.println("4 - Sou Assinante");
        System.out.println("5 - Retornar");
    }


    public static void printAssentosDisponiveisPA(Evento ev) {
        int count = 1;
        for (int i = 0; i < ev.getAssentosPA().size(); i++) {

            if (count == 15) {
                System.out.println();
                count = 1;
            }
            if(ev.getAssentosPA().get(i).getIngresso() != null) {
                System.out.print("Reservado ");
            } else if (ev.getAssentosPA().get(i).getIngresso() == null) {
                System.out.print("PA-" + ev.getAssentosPA().get(i).getNumero() + " ");
            }
            count++;
        }
    }

    public static void printAssentosDisponiveisPB(Evento ev) {

        int count = 1;
        for (Assento as : ev.getAssentosPB()) {

            if (count == 15) {
                System.out.println("\n\n");
                count = 1;
            }
            if(as.getIngresso() != null) {
                System.out.println("Reservado");
                count++;
            }
            System.out.println(as.getNumero());
            count++;
        }
    }

    public static void printAssentosDisponiveisBN(Evento ev) {

        int count = 1;
        for (Assento as : ev.getAssentosBN()) {

            if (count == 15) {
                System.out.println("\n\n");
                count = 1;
            }
            if(as.getIngresso() != null) {
                System.out.println("Reservado");
                count++;
            }
            System.out.println(as.getNumero());
            count++;
        }
    }

    public static void printAssentosDisponiveisCA(Evento ev) {

        int count = 1;
        for (Assento as : ev.getAssentosCA()) {

            if (count == 15) {
                System.out.println("\n\n");
                count = 1;
            }
            if(as.getIngresso() != null) {
                System.out.println("Reservado");
                count++;
            }
            System.out.println(as.getNumero());
            count++;
        }
    }


    public static void menuInicial() {
        System.out.println("Entre com o número opção desejada: ");
        System.out.println("1 - Sou Cliente");
        System.out.println("2 - Sou funcionário");
        System.out.println("3 - Sair");
    }


    public static void menuFunc() {
        System.out.println("############################");
        System.out.println("### Bem vindo colaborador!");
        System.out.println("############################");
        System.out.println("1 - Cadastrar Evento");
        System.out.println("2 - Cadastrar Mídia");
        System.out.println("3 - Vender Ingresso");
        System.out.println("4 - Consultar Evento");
        System.out.println("5 - Consultar Catalogo Cineflix");
        System.out.println("6 - Gerenciar Assentos");
        System.out.println("7 - Relatórios do Teatro");
        System.out.println("8 - Retornar");
    }

    private static void menuRelatorios () {
        System.out.println("############################");
        System.out.println("### Relatórios");
        System.out.println("############################");
        System.out.println("1 - Total Arrecadado no Mes");
        System.out.println("2 - Total de Despesas no Mes");
        System.out.println("3 - Ingressos Vendidos no Mes");
        System.out.println("4 - Número de Assinantes");
        System.out.println("5 - Retornar");
    }

    private static void menuAssinante() {
        System.out.println("############################");
        System.out.println("### Assinante");
        System.out.println("############################");
        System.out.println("1 - Catálogo Cineflix");
        System.out.println("2 - Futuros Eventos Ao Vivo");
        System.out.println("3 - Comprar Ingresso Presencial");
        System.out.println("4 - Minha Assinatura");
        System.out.println("5 - Retornar");

    }


    public static Funcionario cadastrarFuncionario(Teatro teatro) {
        Funcionario func = new Funcionario("João", "1234-56",
                new Data(12, 10, 1992), new Endereco(), teatro );

        return func;
    }

    public static Teatro cadastrarTeatro(Streaming plat) {
        Teatro teatro = new Teatro("Cine-Theatro Central", "UFJF", "Carlos Fernando",
                new Endereco(), "(32)2102-6330", 572,
                660, 269, 120, plat);
        return teatro;
    }

    public static Streaming cadastrarStreaming() {
        Streaming plat = new Streaming("Cineflix");

        return plat;
    }

    public static void inicializarEventos(Teatro teatro) {
        Evento evento1 = new Evento(teatro,"Show", "Um show de música",
                "João da Silva", "20:20", 100, true,
                new Data(12, 12, 2023));

        evento1.introduzirAssentos();

        Evento evento2 = new Evento(teatro,"Show teatral", "Uma peça de teatro",
                "Fernando da Silva", "20:20", 120, true,
                new Data(5, 10, 2022));

        evento2.introduzirAssentos();

        Evento evento3 = new Evento(teatro,"Show teatral 2", "Outra peça de teatro",
                "Fernando da Silva", "20:20", 240, true,
                new Data(5, 10, 2024));

        evento3.introduzirAssentos();

        teatro.addEvento(evento1);
        teatro.addEvento(evento2);
        teatro.addEvento(evento3);
    }

}