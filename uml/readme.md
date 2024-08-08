# Modelando UML iphone #

## Desafio Dio Santander 2024 ## 

nesse desafio , implementei o teste dos pilares do POO implementando interface como parametro para o teste.

```mermaid    
    classDiagram
    class ReprodutorMusical {
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
}

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
