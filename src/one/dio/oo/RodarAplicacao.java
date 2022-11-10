package one.dio.oo;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {
    //vetor classes com 03 objetos abaixo - polimorfismo acontece qdo tem objetos diferentes
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1(); //aqui chama método1 de ClasseFilha1  e da ClasseFilha2 (polimorfismo)
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2(); //pode ou não haver polimorfismo, mas nesse caso não teve pq chamou o método2 direto na ClasseMae
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //aqui não teve polimorfismo, mas sim o @override (sobrescrita)
        classeFilha2.metodo2();
    }

}
