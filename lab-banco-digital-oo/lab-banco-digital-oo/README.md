## Princípios de POO aplicados
✅ Encapsulamento: As classes Conta, Titular e Agencia protegem seus atributos utilizando modificadores de acesso private, permitindo a manipulação segura dos dados por meio de métodos ``get`` e ``set``.

✅ Herança: A classe abstrata Conta define atributos e métodos comuns para as contas bancárias. Suas subclasses ContaPoupanca e ContaCorrente especializam o comportamento, como a cobrança de taxa no saque da conta corrente.

✅ Polimorfismo: O método ``sacar()`` é sobrescrito (@Override) nas subclasses para implementar regras específicas de cada tipo de conta. Isso permite que diferentes classes tenham comportamentos distintos ao executar a mesma operação.

✅ Abstração: A classe Conta representa um conceito genérico de conta bancária, permitindo que diferentes tipos de conta compartilhem uma estrutura comum. Além disso, a interface Transacoes define um contrato para operações bancárias, garantindo que todas as contas implementem métodos essenciais como ``depositar()``, ``sacar()`` e ``transferir()``.
