
public class Review02 {

    public static void main(String[] args) {
        //変数の宣言と初期値のセット
        int num = 1;
        //変数の値が100になるまで繰り返し
        while (num <= 100) {
            //3と5のどちらでも割り切れた場合
            if(num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            //3で割り切れた場合
            } else if(num % 3 == 0) {
                System.out.println("Fizz");
            //5で割り切れた場合
            } else if(num % 5 == 0) {
                System.out.println("Buzz");
            //いずれにも当てはまらない場合
            } else {
                System.out.println(num);
            }
            //変数のカウントアップ
            num++;
        }
    }

}
