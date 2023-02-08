import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var artigo = new Artigo("VS Code com Java", 
        new Autor(nome: "Eduardo Dani Perottoni"), 
        LocalDate.of(year:2022, month:07, dayOfMonth: 13),
        Categoria.BACKEND);
    }
}
