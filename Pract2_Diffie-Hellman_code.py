from random import randint
if __name__  ==  '__main__':
    P=23
    G=9
    
    print('The value of P is : %d' %(P))
    print('The value of G is : %d' %(G))

    a=5
    print('Secret Number for Alice is : %d' %(a))

    x=int(pow(G,a,P))

    b=3
    print('Secret Number for Bob is : %d' %(b))

    y=int(pow(G,b,P))

    Ra=int(pow(y,a,P))

    Rb=int(pow(a,b,P))

    print('Secret Number for Alice is : %d' %(Ra))
    print('Secret Number for Bob is : %d' %(Rb))
