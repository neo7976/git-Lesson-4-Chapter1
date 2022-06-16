public class NoGit {

    private String gitName;

    public NoGit(String gitName) {
        this.gitName = gitName;
    }

    public String getGitName() {
        return gitName;
    }

    public void setGitName(String gitName) {
        this.gitName = gitName;
    }

    public static void main(String[] args) {
        System.out.println("Тестируем новый класс");

        System.out.println("Тест прошел успешно");
    }
}
