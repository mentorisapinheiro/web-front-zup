#language: pt
@regressivo
  Funcionalidade: Compra no página do Amazon web
    Como um usuario
    Quero acessar a conta do site do Amazon
    Para realizar uma compra de um produto com dados cadastrados sem erro.


  @CT01_validaAcessoValido
  Cenário: Validando compra de produto
    Dado que estou na tela de principal da home site www.amazon.com.br
    E clico no botao "Olá, Faça seu Login"
    E informo corretamente os dados de acesso
    Quando clico no botão "Continuar"
    Entao deve ser exibira a mensgem "Olá, Isa...!"
    #situação 2
    E acesso os produtos mais vendidos, seleciona o ítem "suporte de notebook"
    Quando clico no "Adicionar ao carrinho"
    Entao será exibido a mensagem "Adicionado ao carrinho"
    #situação 3
    E clico em fechar pedido
    E adiciono os meus dados cadastrais
    E realizo pagamento via cartão de credito
    Quando clico no botão continuar
    Entao o botão continuar ficará inativo, e a simulação da compra foi realizada com sucesso.




