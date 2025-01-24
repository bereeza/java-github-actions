public record User(int id, String email) {
    @Override
    public String toString() {
        return STR."User{id=\{id}, email='\{email}'}";
    }
}
