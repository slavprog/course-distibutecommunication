package com.course.distributecommunication.frontend.model;

public class BookDto
{
        private int id;
        private String title;
        private int pages;
        private int authorId;

    public BookDto(int id) {
        this.id = id;
    }

        public int getId() {
        return id;
    }

        public String getTitle() {
        return title;
    }

        public void setTitle(String title) {
        this.title = title;
    }

        public int getPages() {
        return pages;
    }

        public void setPages(int pages) {
        this.pages = pages;
    }

        public int getAuthorId() {
        return authorId;
    }

        public void setAuthorId(int autorId) {
        this.authorId = autorId;
    }

    public BookDto(int id, String title, int pages, int authorId) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.authorId = authorId;
    }
}
