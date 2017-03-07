package com.sdajava.listimplementation;

/**
 * Created by user on 2017-03-06.
 */
public class ListImpl {

    //tworze klase zagniezdzona

        private Node begin;
        private Node end;

        //funkcja ktora nam wyzeruje te dwa elementy

        public ListImpl() {
            this.begin = null; //this nie musi byc bo nie mamy takich samych nazw
            this.end = null; //this nie musi byc
        }

        //funkcja ktora bedzie odpowiadac za wstawienie czegos

        public void addElement(String value) {

            //tworzymy nowy wezel

            Node node = new Node(value, null, null);

            //metoda ktora sprawdzi czy lista jest pusta
            //tworzenie nowego elementu

            if (checkIsEmpty()) {
                begin = node;
                end = node;
            } else {
                Node pm = begin; //klase begin przypisujemy do wezla pm

                //pobieram nastepne elementy z wykorzystaniem while do momentu az bedzie rozny od nulla

                while (pm != null) {
                    pm.getNext(); //iteruje sie

                    //jesli sie przeiterujemy po tym wezle to trzeba teraz ten element wstawic
                    if (pm == begin) {
                        node.setNext(pm);
                        pm.setPrev(node);
                        begin = node;
                        break; //przerywa petle wychodzi z niej
                        //a w przeciwnym wypadku
                    } else {
                        node.setNext(pm);
                        node.setPrev(pm.getPrev());
                        pm.getPrev().setPrev(node);
                        pm.setPrev(node);
                        break;
                    }

                }
                if (pm == null) {
                    end.setNext(node);
                    node.setPrev(end);
                    end = node;
                }
            }

        }

        public boolean checkIsEmpty(){
            return (begin == null);
        }

        public void showList(){

            Node list = end; //wyswietlanie listy z wykorzystaniem wezla
            while(list != null){ //niech wyswietla liste az nie bedzie nullem
                System.out.println(list.getValue());
                list = list.getPrev();
            }
        }
        //musimy przeiterowqac sie po calej liscie
    public int size(){
            Node list = begin;
            int counter = 0;
            while(list != null){
                counter++;
                list = list.getNext();
            }
            return counter;
    }
}

