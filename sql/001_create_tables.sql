CREATE TABLE cliente(
                        id UUID PRIMARY KEY ,
                        nome VARCHAR(100) NOT NULL ,
                        telefone VARCHAR(20) NOT NULL,
                        data_criacao TIMESTAMP NOT NULL
);

CREATE TABLE categoria(
                          id UUID PRIMARY KEY,
                          nome VARCHAR(50) NOT NULL,
                          ativo BOOLEAN NOT NULL
);

CREATE TABLE produto(
                        id UUID PRIMARY KEY NOT NULL,
                        categoria_id UUID NOT NULL,
                        nome VARCHAR(50) NOT NULL,
                        preco DECIMAL(10,2) NOT NULL,
                        estoque INTEGER NOT NULL,
                        ativo BOOLEAN NOT NULL ,

                        FOREIGN KEY(categoria_id)
                            REFERENCES categoria(id)
);

CREATE TABLE pedido(
                       id UUID PRIMARY KEY NOT NULL,
                       numero_pedido INTEGER NOT NULL,
                       data_pedido TIMESTAMP NOT NULL,
                       valor_total DECIMAL(10,2) NOT NULL,
                       status VARCHAR(30) NOT NULL,
                       cliente_id UUID NOT NULL,

                       FOREIGN KEY (cliente_id)
                           REFERENCES cliente(id)
);

CREATE TABLE item_pedido(
                            id UUID PRIMARY KEY NOT NULL,
                            quantidade INTEGER NOT NULL,
                            valor_unitario DECIMAL(10,2) NOT NULL,
                            subtotal DECIMAL(10,2) NOT NULL,
                            pedido_id UUID NOT NULL,
                            produto_id UUID NOT NULL,

                            FOREIGN KEY (pedido_id)
                                REFERENCES pedido(id),
                            FOREIGN KEY (produto_id)
                                REFERENCES produto(id)
);

CREATE TABLE pagamento(
                          id UUID PRIMARY KEY NOT NULL,
                          valor DECIMAL(10,2) NOT NULL,
                          data_pagamento TIMESTAMP NOT NULL,
                          tipo_pagamento VARCHAR(20) NOT NULL,
                          status_pagamento VARCHAR(20) NOT NULL,
                          pedido_id UUID NOT NULL,

                          FOREIGN KEY (pedido_id)
                              REFERENCES pedido(id)
);

CREATE TABLE fechamentoCaixa(
                                id UUID PRIMARY KEY NOT NULL,
                                data TIMESTAMP NOT NULL,
                                total_dinheiro DECIMAL(10,2),
                                total_cartao_credito DECIMAL(10,2),
                                total_cartao_debito DECIMAL(10,2),
                                total_pix DECIMAL(10,2)
);
