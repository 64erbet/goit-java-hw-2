class NameEncoderDecoder {
    
    public String encode(String name) {
        char[] mas_char = name.toCharArray();
      
        for (int i = 0; i < mas_char.length; i++) {
            if (mas_char[i] == 'e') {
                mas_char[i] = '1';
            } else {
                if (mas_char[i] == 'u') {
                    mas_char[i] = '2';
                } else {
                    if (mas_char[i] == 'i') {
                        mas_char[i] = '3';
                    } else {
                        if (mas_char[i] == 'o') {
                            mas_char[i] = '4';
                        } else {
                            if (mas_char[i] == 'a') {
                                mas_char[i] = '5';
                            }
                        }
                    }
                }
            }          
        }
      return ("NOTFORYOU" + new String(mas_char) +                           "YESNOTFORYOU");
      
    }
  
    public String decode(String name) {
        String name_cifri = name.substring(9, (name.length()-12));
      
        char[] mas_char_cifri = name_cifri.toCharArray();
      
        for (int i = 0; i < mas_char_cifri.length; i++) {
            if (mas_char_cifri[i] == '1') {
                mas_char_cifri[i] = 'e';
            } else {
                if (mas_char_cifri[i] == '2') {
                    mas_char_cifri[i] = 'u';
                } else {
                    if (mas_char_cifri[i] == '3') {
                        mas_char_cifri[i] = 'i';
                    } else {
                        if (mas_char_cifri[i] == '4') {
                            mas_char_cifri[i] = 'o';
                        } else {
                            if (mas_char_cifri[i] == '5') {
                                mas_char_cifri[i] = 'a';
                            }
                        }
                    }
                }
            }          
        }
      return (new String(mas_char_cifri));
    }
}
