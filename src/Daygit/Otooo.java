package Daygit;



    public class Otooo {
        private String name;
        private String color;
        private int year ;
        private String trademark;
        private int horsepower ;
        private int price ;
        private int inputday;

        public Otooo(String name, String color, int year, String trademark, int horsepower, int price, int inputday) {
            this.name = name;
            this.color = color;
            this.year = year;
            this.trademark = trademark;
            this.horsepower = horsepower;
            this.price = price;
            this.inputday = inputday;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getTrademark() {
            return trademark;
        }

        public void setTrademark(String trademark) {
            this.trademark = trademark;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getInputday() {
            return inputday;
        }

        public void setInputday(int inputday) {
            this.inputday = inputday;
        }

        @Override
        public String toString() {
            return "Otooo{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", year=" + year +
                    ", trademark='" + trademark + '\'' +
                    ", horsepower=" + horsepower +
                    ", price=" + price +
                    ", inputday=" + inputday +
                    '}';
        }
    }


