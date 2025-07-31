package ch04_class;

public class MessageSender {
    public static void main(String[] args) {
        MessageSenderClass msc = new MessageSenderClass();

        // 1. 기본 메시지 전송
        msc.send("Alice", "Hello!");

        // 2. 긴급 메시지 전송
        msc.send("Bob", "회의가 취소되었습니다.", true);

        // 3. 여러 사람에게 같은 메시지 전송
        String[] recipients = {"Alice", "Charlie"};
        msc.send(recipients, "안녕하세요!");

        // 4. 코드 메시지 전송
        msc.send("Dave", 404);

        // 5. 가변 인자 메시지 전송
        msc.send("첫 번째 메시지", "두 번째 메시지", "세 번째 메시지");

    }

    static class MessageSenderClass {
        public void send(String to, String message) {
            // 기본적인 메시지 전송
            System.out.println("To: " + to + " | Message: " + message);
        }

        public void send(String to, String message, boolean urgent) {
            // urgent가 true면 [긴급]이라는 접두어를 붙여 메시지 전송
            if (urgent) {
                System.out.println("To: " + to + " | Message: [긴급] " + message);
            } else {
                System.out.println("To: " + to + " | Message: " + message);
            }
        }

        public void send(String[] recipients, String message) {
            // 여러 사람에게 같은 메시지 전송
            for (int i = 0; i < recipients.length; i++) {
                System.out.println("To: " + recipients[i] + " | Message: " + message);
            }
        }

        public void send(String to, int code) {
            // code가 404면 “요청한 정보를 찾을 수 없습니다”와 함께 전송
            if (code == 404) {
                System.out.println("To: " + to + " | Message: 코드 오류 - 요청한 정보를 찾을 수 없습니다.");
            }
        }

        public void send(String... messages) {
            // 메시지를 한 줄씩 전송. 대상은 "알 수 없음"으로 출력
            for (int i = 0; i < messages.length; i++) {
                System.out.println("To: 알 수 없음 | Message: " + messages[i]);
            }
        }
    }
}

