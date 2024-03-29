package parte03;

import java.util.List;
import javax.swing.JOptionPane;

public class BibliotecaDAO {
    private static final String ARQUIVO_LIVROS = "livros.txt";
    private static final String ARQUIVO_ALUNOS = "alunos.txt";

    private LivroDAO livroDAO;
    private AlunoDAO alunoDAO;

    public BibliotecaDAO() {
        this.livroDAO = new LivroDAO(ARQUIVO_LIVROS);
        this.alunoDAO = new AlunoDAO(ARQUIVO_ALUNOS);
    }

    public void cadastrarLivro() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro:"));
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        String autor = JOptionPane.showInputDialog("Digite o nome do autor do livro:");
        String area = JOptionPane.showInputDialog("Digite a área do livro:");

        CadastroLivro novoLivro = new CadastroLivro(codigo, titulo, autor, area);
        if (livroDAO.salvarLivro(novoLivro)) {
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro.");
        }
    }

    public void listarLivros() {
        List<CadastroLivro> livros = livroDAO.carregarLivros();
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
        } else {
            StringBuilder lista = new StringBuilder();
            for (CadastroLivro livro : livros) {
                lista.append("Código: ").append(livro.getCodigo()).append(", Título: ").append(livro.getTitulo()).append(", Autor: ").append(livro.getAutor()).append(", Área: ").append(livro.getArea()).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    public void cadastrarAluno() {
        int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno:"));
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        // Outros dados do aluno...

        Aluno novoAluno = new Aluno(ra, nome);
        if (alunoDAO.salvarAluno(novoAluno)) {
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o aluno.");
        }
    }

    // Outros métodos para manipulação de alunos, empréstimos, etc...
}

        CadastroLivro novoLivro = new CadastroLivro(codigo, titulo, autor, area);
        if (livroDAO.salvarLivro(novoLivro)) {
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro.");
        }
    }

    public void listarLivros() {
        List<CadastroLivro> livros = livroDAO.carregarLivros();
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
        } else {
            StringBuilder lista = new StringBuilder();
            for (CadastroLivro livro : livros) {
                lista.append("Código: ").append(livro.getCodigo()).append(", Título: ").append(livro.getTitulo()).append(", Autor: ").append(livro.getAutor()).append(", Área: ").append(livro.getArea()).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    public void cadastrarAluno() {
        int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno:"));
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        // Outros dados do aluno...

        Aluno novoAluno = new Aluno(ra, nome);
        if (alunoDAO.salvarAluno(novoAluno)) {
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o aluno.");
        }
    }

    // Outros métodos para manipulação de alunos, empréstimos, etc...
}
