package com.kartikpatodi.patterns.iterator.aggregate;

import com.kartikpatodi.patterns.iterator.iter.IIterator;

public class Arts implements ISubject {

    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "English";
        subjects[1] = "Hindi";
    }

    public Arts(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public IIterator createIterator() {
        return new ArtsIterator(subjects);
    }

    private class ArtsIterator implements IIterator<String> {

        private String[] subjects;
        private int position;

        public ArtsIterator(String[] subjects) {
            this.subjects = subjects;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects[position++];
        }

        @Override
        public boolean isDone() {
            return position >= subjects.length;
        }

        @Override
        public String currentItem() {
            return subjects[position];
        }
    }
}
