package creatinalPattern.prototype;

public class User extends AbstractEntity {
    public String socialKey;
    public String secretKey;
    public String displayName;
    public String pictureUrl;
    public String sessionId;
    public String referenceKey;
    public int level;
    public int lesson;
    public int darkMatter;
    public int rating;
    public String email;
    public String country;
    public String city;
    public String statusMessage;

    public User() {
    }

    @Override
    public AbstractEntity clone() {
        return new User(this);
    }

    public User(User source) {
        super(source);
        this.socialKey = source.socialKey;
        this.secretKey = source.secretKey;
        this.displayName = source.displayName;
        this.pictureUrl = source.pictureUrl;
        this.sessionId = source.sessionId;
        this.referenceKey = source.referenceKey;
        this.level = source.level;
        this.lesson = source.lesson;
        this.darkMatter = source.darkMatter;
        this.rating = source.rating;
        this.email = source.email;
        this.country = source.country;
        this.city = source.city;
        this.statusMessage = source.statusMessage;

    }

}
