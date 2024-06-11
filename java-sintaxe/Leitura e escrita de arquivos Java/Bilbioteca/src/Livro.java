public class Livro {
    private String title;
    private String autor;
    private int pag;
    private String tags [] = new String[3];

    public Livro(String title, String autor, int pag) {
        this.title = title;
        this.autor = autor;
        this.pag = pag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
