import pojo.User;

public class Survey {

    private final User owner;
    private final String text;

    public Survey(User owner, String text) {
        this.owner = owner;
        this.text = text;
    }

    public String getOwner() {
        return owner.getUsername();
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "owner=" + owner +
                ", text='" + text + '\'' +
                '}';
    }
}
