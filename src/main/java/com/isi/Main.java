package com.isi;

public class Main {
    public static void main(String[] args) {
        NotifComponent mail = new NotifMail();
        System.out.println(mail.getObjet() + " de "+ mail.getDestinataire() + "! Message: " + mail.getMessage());
        }
    }
