package de.telran.averchenko.elena.homework16.arraylist;

import java.util.List;

public class OneMoreNew<S extends Comparable<S>, T extends List<S>,K extends OneMoreNewComparator<S>>  {

        List <S> list;
    OneMoreNewComparator<S> oneMoreNewComparator;

    public OneMoreNew(List<S> list, OneMoreNewComparator<S> oneMoreNewComparator) {
        this.list = list;
        this.oneMoreNewComparator = oneMoreNewComparator;
    }

    public OneMoreNew() {
        }

        public void add(S value){
            list.add(value);

        }

        public  void sort(){
            list.sort(oneMoreNewComparator);
        }

        public S getMaxNew(){
            sort();
            return list.get(list.size()-1);
        }

        @Override
        public String toString() {
            return "ListGen{" +
                    "list=" + list +
                    '}';
        }
    }


