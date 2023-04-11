# BASICO List, ArrayList em Poo

ps: isso aqui é apenas um estudo, qualquer correção ou outra forma de fazer é bem vinda 

Aqui esta um codigo aberto de estudos que fiz em relação as aulas de POO e ESTRUTURA DE DADOS, todo legendado, linha por linha...



Nele estou utilizando LIST E ARRAYLIST e fundamentos de POO com metodos get and set dentro de uma classe Cliente que esta extends de Pessoas
# List< Cliente > lista_cliente = new ArrayList();


# EXISTEM DUAS FORMAS DE VOCÊ MANIPULAR A LISTA, SENDO ELES 2 TIPOS DE LOOP - > SEGUE EXEMPLOS <

# MODELO 1 DE LOOP BASICO


      for (int i = 0; i < lista_cliente.size(); i++) {
                        
     
      lista_cliente.get(i).cadastrarCliente();
      lista_cliente.get(i).getId();
      lista_cliente.get(i).setId(id);
      
      
      break;
      } 
                                               
# MODELO 2 DE LOOP - FOR EACH
                                               
                                               
      for (Cliente i : lista_cliente) {
      
      i.cadastrarCliente();
      i.getId();
      i.setId(id);
      break;
                        }                                         
                                               
                                               




#

![image](https://user-images.githubusercontent.com/119326011/231076416-da8afb84-9ca2-4f70-9e27-c608a0c06b7f.png)

Esse codigo é aberto para vocês copiarem, editarem e fazerem o que quiser com ele.

Qualquer dúvida, é so chamar no meu privado.



