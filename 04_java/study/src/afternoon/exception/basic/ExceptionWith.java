package afternoon.exception.basic;

// 예외처리
public class ExceptionWith {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            accessArr(arr, 5);
            System.out.println("예외가 발생하지 않았습니다!");
            System.out.println("원하는 작업을 이어갑니다!");

            Object obj = null;

            accessNull(obj);
            System.out.println("객체가 null 이 아닙니다!");
            System.out.println("원하던 작업을 이어갑니다!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 배열과 idx 를 받아서 해당 값에 접근이 가능한지 확인하는 메서드
    public static boolean accessArr(int[] arr, int idx) {
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    // 전달 받은 객체가 비었는지 안 비었는지 확인하는 메서드
    // 어떤 모든 객체를 받기 위해 Object 타입으로 받음
    public static boolean accessNull(Object obj) {
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }
}
