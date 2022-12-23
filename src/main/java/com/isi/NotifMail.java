package com.isi;

public class NotifMail extends NotifComponent{
    public NotifMail(){
        setObjet("Nouveau message par mail");
        setMessage("ceci est un nouveau message");
        setDestinataire("Koffi");
    }
}
