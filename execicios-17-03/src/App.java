public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Camisa", 100.50);

        Produto p2 = new Produto("Bermuda");

        System.out.println(p1.getNome() + " - R$ " + p1.getPreco());
        System.out.println(p2.getNome() + " - R$ " + p2.getPreco());

        Aluno a1 = new Aluno();
        a1.setNome("André");
        a1.setNota(10);

        Aluno a2 = new Aluno();
        a2.setNome("Bruno");
        a2.setNota(9);

        Aluno a3 = new Aluno();
        a3.setNome("Carlos");
        a3.setNota(8);

        System.out.println(a1.getNome() + " - Nota: " + a1.getNota());
        System.out.println(a2.getNome() + " - Nota: " + a2.getNota());
        System.out.println(a3.getNome() + " - Nota: " + a3.getNota());

        Animal[] animal = new Animal[2];

        animal[0] = new Cachorro("Totó");
        animal[1] = new Gato("Frajola");

        for (Animal a : animal) {
            System.out.print(a.getNome() + ": ");
            a.emitirSom();
        }
    }
}
