package algorithm.stack_queue;

public class Stack_Example {
    public static void main(String[] args) {


        // class 키워드의 예
/*        class Person {
            private static String name;

            public static void setName(String name) {
                Person.name = name;
            }

            public String speak() {
                return "저는 "+Person.name +"입니다.";
            }
        }

        Person person = new Person();
        person.setName("김코딩");
        System.out.println(person.speak());*/


        // Stack의 특징중 하나인 LIFO
        // ex) 1, 2, 3, 4를 스택에 차례로 넣음

        Stack<Integer> stack = new Stack<>(); // Integer형 스택 선언
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // 1 <- 2 <- 3 <- 4
        // ex2) 스택이 빌 때 까지 데이터 전부 pop
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        // 4, 3, 2, 1   마지막부터 처음 순으로 데이터가 1개씩 나옴


    }
}

