// const veiculo1 = prompt('Digite o nome do primeiro veículo: ')
// const velocidade1 = parseFloat(prompt('Digite a velocidade do primeiro veículo: '))

// const veiculo2 = prompt('Digite o nome do segundo veículo: ')
// const velocidade2 = parseFloat(prompt('Digite a velocidade do segundo veículo: '))


// if (velocidade1 > velocidade2) {
//     alert(veiculo1 + ' é mais rápido que ' + veiculo2)
// } else if (velocidade1 < velocidade2) {
//     alert(veiculo2 + ' é mais rápido que ' + veiculo1)
// } else {
//     alert('Ambos tem a mesma velocidade')
// }



// const personagem1 = prompt('Digite o nome do personagem: ')
// const poderAtaque = parseFloat(prompt('Digite o poder de Ataque: '))

// const personagem2 = prompt('Digite o nome do segundo personagem: ')
// let pontosVida = parseFloat(prompt('Digite o pontos de vida: '))
// const poderDefesa = parseFloat(prompt('Digite o poder de defesa: '))
// const possuiEscudo = prompt('Possui escudo? ')

// let danoCausado = 0

// if (poderAtaque > poderDefesa && possuiEscudo === 'Não') {
//     danoCausado = poderAtaque - poderDefesa
// } else if (poderAtaque > poderDefesa && possuiEscudo === 'Sim') {
//     danoCausado = (poderAtaque - poderDefesa) / 2
// } 

// pontosVida -= danoCausado

// alert(personagem1 + ' causou ' + danoCausado + ' pontos de dano em ' + personagem2)

// alert(
//     personagem1 + '\nPoder de Ataque: ' + poderAtaque + '\n\n' +
//     personagem2 + '\nPontos de vida: ' + pontosVida + 
//     '\nPoder de defesa: ' + poderDefesa + '\nPossui Escudo? ' +
//     possuiEscudo




// const medida = parseFloat(prompt('Digite a medida em metros: '))

// const conversor = prompt('Escolha um conversor:' +
//     '\n1.milímetro (mm)' +
//     '\n2.centímetro (cm)' +
//     '\n3.decímetro (dm)' +
//     '\n4.decâmetro (dam)' +
//     '\n5.hectômetro (hm)' +
//     '\n6.quilômetro (km)' +
//     '\n7.Sair'
// )


// switch (conversor) {
//     case '1':
//         alert('A conversão é ' + medida * 1000)
//         break
//     case '2':
//         alert('A conversão é ' + medida * 100) 
//         break
//     case '3': 
//         alert('A conversão é ' + medida * 10)
//         break
//     case '4':
//         alert('A conversão é ' + medida / 10)
//         break
//     case '5':
//         alert('A conversão é ' + medida / 100)
//         break
//     case '6':
//         alert('A conversão é ' + medida / 1000)
//         break
//     case '7':
//         alert('Saindo...')
//         break
//     default:
//         alert('Opção inválida')
//         break
// }



// const turista = prompt('Digite seu nome: ')
// let cidades = ''
// let contagem = 0

// let continuar = prompt('Você já viajou para alguma cidade? ')

// while (continuar === 'Sim' || continuar === 'sim') {
//     let cidade = prompt('Qual é o nome da cidade visitada ? ')
//     cidades += ' - ' + cidade + '\n'
//     contagem ++
//     continuar = prompt('Você já visitou alguma outra cidade? ')
// }

// alert('\nNome do turista: ' + turista +
//     '\nQuantidades de cidades visitadas: ' + contagem +
//     '\nNomes das cidades visitadas:\n ' + cidades
// )




// let menu = ''

// while(menu !== '5') {
//     menu = prompt('Menu interativo: ' + 
//         '\n1.Opção 1: ' + 
//         '\n2.Opção 2: ' +
//         '\n3.Opção 3: ' + 
//         '\n4.Opção 4: ' + 
//         '\n5.Opção 5: ' 
//         )
        
//         switch (menu) {
//             case '1':
//                 alert('Você escolheu a opção 1')
//                 break
//             case '2':
//                 alert('Você escolheu a opção 2')
//                 break
//             case '3':
//                 alert('Você escolheu a opção 3')
//                 break
//             case '4':
//                 alert('Você escolheu a opção 4')
//                 break
//             case '5':
//                 alert('Encerrando...')
//                 break
//             default:
//                 alert('Opção inválida')
//                 break
//         }
// }

// let menu = ''

// do {

//     menu = prompt('Menu interativo: ' + 
//         '\n1.Opção 1: ' + 
//         '\n2.Opção 2: ' +
//         '\n3.Opção 3: ' + 
//         '\n4.Opção 4: ' + 
//         '\n5.Opção 5: ' 
//     )

//     switch (menu) {
//         case '1':
//             alert('Você escolheu a opção 1')
//             break
//         case '2':
//             alert('Você escolheu a opção 2')
//             break
//         case '3':
//             alert('Você escolheu a opção 3')
//             break
//         case '4':
//             alert('Você escolheu a opção 4')
//             break
//         case '5':
//             alert('Encerrando...')
//             break
//         default:
//             alert('Opção inválida')
//             break
//     }
// } while (menu !== '5');




// let saldo = parseFloat(prompt('Qual é o seu saldo? '))
// let opcao = ''

// do {

//     opcao = prompt('Saldo disponível: ' + saldo +
//         '\n1.Adicionar dinheiro :' + 
//         '\n2.Remover dinheiro: ' +
//         '\n3.Sair'
//     )

//     switch(opcao) {
//         case '1':
//             saldo += parseFloat(prompt('\nSaldo: ' + saldo + '\n\nQuanto você quer adicionar? '))
//             break
//         case '2':
//             saldo -= parseFloat(prompt('\nSaldo: ' + saldo + 'Quanto você quer remover? '))
//             break
//         case '3':
//             alert('Encerrando...')
//             break
//         default:
//             alert('Opção inválida')
//             break
//     }

// } while(saldo !== '3');


const palindromo = prompt('Digite uma palavra')
let palavraInvertida = ''

for(let i = palindromo.length-1; i>=0; i-- ) {
palavraInvertida += palindromo[i]
}

    if (palindromo === palavraInvertida){
        alert(palindromo + ' É um palíndromo')
    } else if (palindromo !== palavraInvertida)
        alert('Não é um palindromo ' +
            '\n\n' + palindromo + ' é diferende de ' + palavraInvertida
        )




















// let tabuada = parseFloat(prompt('Escolha um número para ser multiplicado: '))

// resultado = ''

// for(let fator = 1; fator <= 20; fator++) {
//     resultado += tabuada + ' x ' + fator + ' = ' + (tabuada * fator) + '\n'
// }

// alert('Resultado da tabuada do ' + tabuada + ':' +
//     '\n\n' + resultado
// )





// const palindromo = prompt('Digite uma palavra: ')
// let inversao = ''

// for(let i = palindromo.length - 1; i >= 0; i--) {
//     inversao += palindromo[i]
//     }
    
//     if (palindromo === inversao) {
//         alert(palindromo + ' é um palíndromo')
//     } else {
//         alert(palindromo + ' não é um palíndromo' + 
//             '\n\n' + palindromo + ' é diferente de ' + inversao
//         )
//     }