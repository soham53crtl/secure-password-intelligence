public class PasswordResponse {
    private int score;
    private String strength;
    private String hash;

    public PasswordResponse(int score, String strength, String hash) {
        this.score = score;
        this.strength = strength;
        this.hash = hash;
    }

    public int getScore() { return score; }
    public String getStrength() { return strength; }
    public String getHash() { return hash; }
}
