package Bai1;

public class People {
        protected String name;
        protected int age;
        String sex;
        protected double height;
        protected double weight;

        public People() {
        }

        public People(String name, int age, String sex, double height, double weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\n age: " + age + "\n sex: " + sex + "\n height: " + height + "\n weight: " + weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }

}
