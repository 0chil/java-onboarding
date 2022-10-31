package onboarding.problem6;

public class Request {

	private final String email;
	private final Nickname nickname;

	public Request(String email, String nickname) {
		this.email = email;
		this.nickname = new Nickname(nickname);
	}

	public boolean hasOverlapOf(Request other) {
		return nickname.hasOverlapOf(other.nickname);
	}
}
