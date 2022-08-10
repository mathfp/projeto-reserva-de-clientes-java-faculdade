
Projeto realizado em java no 1° Semestre de 2021 

# Reserva de Clientes Restaurante Sabor Sofisticado

(restaurante fictício)

O projeto utiliza as janelas gráficas da classe java JOptionPane para criação do menu de reservas do restaurante, onde o usuário escolhe/digita o número correspondente a opção desejada.

## Menu de Reservas do Restaurante

  * 1 Reservar Mesa
  * 2 Pesquisar Reserva
  * 3 Imprimir Reservas
  * 4 Imprimir lista de espera
  * 5 Cancelar Reserva
  * 6 Finalizar
  
  Sendo assim, o usuário escolhe as respectivas opções: 
  
   1. Reservar alguma mesa, digitando o nome, tipo da pessoa (física ou jurídica), forma de pagamento (á vista ou parcelado) ;
   
   2. Pesquisar alguma reserva por meio do cpf ou cnpj da pessoa;
   
   3. Impressão da lista de reservas dos clientes com os dados (nome, tipo da pessoa, forma de pagamento);
   
   4. Impressão da lista de espera com os dados dos clientes (nome, tipo da pessoa, forma de pagamento);
   
   5. Cancelar alguma reserva da lista de reservas através do fornecimento do cpf ou cnpj do cliente que se encontra na lista;
  
  6. Fim da execução do programa;
  
  Regras de Negócio:
  
  * Se a pessoa for física será pedido o cpf;
  * Se a pessoa for jurídica será pedido o cnpj;
  * Só é possível incluir até 5 pessoas na lista de reservas; 
  * Se a pessoa decidir realizar mais reservas, as próximas irão para uma lista de espera; 
  * Só será possível o cliente ir da lista de espera para a lista de reservas quando alguma reserva (da lista de reservas) for cancelada;
  * Quando cancelar alguma reserva, o primeiro cliente da lista de espera irá para lista de reservas e assim removendo-o da lista de espera.
   
   ![image](https://user-images.githubusercontent.com/68198636/184022391-fd586b59-7eb8-4df3-8c4a-dd11dd9b46d3.png)
