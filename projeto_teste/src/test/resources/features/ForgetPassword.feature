Feature: ForgotPassword

  Scenario:Validar o título e Subtitulo da página de Forget Password deve ser exibido corretamente
    Given que o usuário esteja na página Forget Password
    When o usuário visualiza a página
    Then o título da página deve ser exibido como Forget Password no cabeçalho
    And o subtítulo deve ser Please enter your email below

  Scenario: Validar senha com email válido
    Given que o usuário esteja na página Forget Password
    When digita um email válido no campo Email
    And marca a opção Não sou um robô
    And clica no botão Reset Password
    Then uma mensagem de confirmação deve ser exibida indicando que o email de recuperação foi enviado

  Scenario: Validar senha sem preencher o email
    Given que o usuário esteja na página Forget Password
    When não preenche o campo Email
    And marca a opção Não sou um robô
    And clica no botão Reset Password
    Then uma mensagem de erro deve ser exibida indicando que o campo email é obrigatório

  Scenario: Validar senha com email inválido
    Given que o usuário esteja na página Forget Password
    When preenche um email inválido no campo Email
    And marca a opção Não sou um robô
    And clica no botão Reset Password
    Then uma mensagem de erro deve ser exibida indicando que o email fornecido não é válido

  Scenario: Validar o botão Back to Login para direcionamento para página de login
  Given que o usuário esteja na página Forget Password
  When clicar no botão Back to Login
  Then o sistema direciona para a página de login


