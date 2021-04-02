package homework1.task3;

public class Book {

        private Title title;
        private Author author;
        private Content content;

        void show(){
            title.show();
            author.show();
            content.show();
        }

        public void setTitle(Title title) {
            this.title = title;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public void setContent(Content content) {
            this.content = content;
        }

    }

