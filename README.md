# Projeto Integrador
Sistema Inteligente de Monitoramento e Gestão de EPI Grupo: Ricardo Fogel; João Gabriel; Rafael Saldanha; João Accácio.

Descrição : Sistema Inteligente de Monitoramento e Gestão de EPI

Este projeto propõe o desenvolvimento de uma plataforma voltada para **segurança do trabalho em ambientes industriais**, com foco no controle e monitoramento do uso de Equipamentos de Proteção Individual (EPI). A ideia surgiu a partir de um problema comum em muitas empresas: a dificuldade de acompanhar, de forma eficiente e contínua, se os trabalhadores estão utilizando corretamente os equipamentos de proteção exigidos em determinadas áreas. 

A solução desenvolvida busca unir **gestão digital de equipamentos** com **visão computacional**, permitindo não apenas o controle da retirada e devolução de EPIs, mas também o monitoramento automático de áreas onde o uso desses equipamentos é obrigatório.

O sistema combina um painel de controle para acompanhamento das informações, um módulo de gestão de equipamentos e um sistema de visão computacional capaz de identificar, por meio de câmeras, se os trabalhadores estão utilizando os EPIs necessários ao acessar determinadas áreas.

## Objetivo do projeto

O principal objetivo deste projeto é criar uma ferramenta que ajude empresas a melhorar o controle de segurança dentro do ambiente de trabalho. A plataforma permite acompanhar o uso de equipamentos de proteção, registrar a movimentação desses equipamentos e identificar automaticamente situações em que um trabalhador entra em uma área de risco sem os EPIs obrigatórios.

Além de contribuir para a prevenção de acidentes, o sistema também facilita o trabalho das equipes responsáveis pela segurança do trabalho, oferecendo informações organizadas, histórico de registros e alertas em tempo real.

## Como o sistema funciona

O projeto é dividido em três partes principais.

A primeira parte é o módulo de **gestão de EPIs**, responsável por registrar funcionários, controlar a retirada e devolução de equipamentos e manter um histórico de utilização. Com isso, é possível saber quais equipamentos estão em uso, quem está utilizando e quando foram retirados.

A segunda parte é o **sistema de visão computacional**. Câmeras posicionadas em locais estratégicos monitoram áreas onde o uso de equipamentos de proteção é obrigatório. A partir de modelos de detecção de objetos baseados em inteligência artificial, o sistema consegue identificar a presença de pessoas e verificar se determinados EPIs estão sendo utilizados.

Quando o sistema identifica que uma pessoa está sem um equipamento obrigatório, um alerta é gerado informando qual item está faltando, em qual área ocorreu a detecção e em qual horário.

A terceira parte é o **dashboard de monitoramento**, um painel web que centraliza todas as informações do sistema. Nele é possível visualizar alertas recentes, acompanhar registros de detecção, verificar indicadores de conformidade e monitorar o funcionamento das câmeras instaladas no ambiente.

## Tecnologias utilizadas

O sistema foi desenvolvido utilizando tecnologias amplamente utilizadas no desenvolvimento de software e em projetos de inteligência artificial.

Na parte de visão computacional são utilizados Python, OpenCV e modelos de detecção de objetos baseados em YOLO.

A interface do sistema é construída com HTML, CSS e JavaScript, permitindo a criação de um dashboard acessível por navegador.

O projeto também pode ser integrado a uma API e a um banco de dados para armazenamento de registros, histórico de eventos e gerenciamento das informações dos funcionários e dos equipamentos.

## Benefícios da solução

A principal vantagem dessa solução é permitir um monitoramento mais consistente do uso de equipamentos de proteção. Em vez de depender apenas da fiscalização manual, o sistema ajuda a identificar rapidamente situações de risco.

Entre os principais benefícios estão a melhoria no controle de segurança, a redução de falhas humanas na fiscalização, a geração de registros que podem ser utilizados em auditorias e a possibilidade de acompanhar dados de conformidade ao longo do tempo.

Além disso, o sistema pode servir como base para novas funcionalidades, como integração com aplicativos móveis, geração automática de relatórios ou integração com sistemas de controle de acesso.

## Possíveis aplicações

Este projeto pode ser aplicado em diversos contextos onde o uso de equipamentos de proteção é obrigatório. Alguns exemplos incluem canteiros de obras, indústrias, centros de distribuição, ambientes logísticos e áreas de produção que exigem medidas específicas de segurança.

## Observação

Este projeto foi desenvolvido com fins educacionais e de pesquisa, com o objetivo de explorar o uso de tecnologias de visão computacional aplicadas à segurança no ambiente de trabalho.
