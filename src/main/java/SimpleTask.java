public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;
    }

    public boolean matches(String query) {
        return title.contains(query);
    }
}