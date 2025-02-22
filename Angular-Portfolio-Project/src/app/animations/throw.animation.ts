import { animation, style, animate, query, sequence, keyframes } from '@angular/animations';

export const throwDice = animation([
  sequence([
    query( ':self',[
      animate(
        '5s',
        keyframes ([
          style({transform : 'scale(1.5)', offset: 0.10}),
          style({transform : 'scale(1)', offset: 0.15}),
          style({transform : 'rotate(45deg) translate(-30%, 10%)', offset: 0.20}),
          style({transform : 'rotate(90deg) translate(30%, 10%)', offset: 0.25}),
          style({transform : 'rotate(135deg) translate(-30%, 10%)', offset: 0.30}),
          style({transform : 'rotate(180deg) translate(30%, 10%)', offset: 0.35}),
          style({transform : 'rotate(135deg) translate(-30%, 10%)', offset: 0.45}),
          style({transform : 'rotate(90deg) translate(30%, 10%)', offset: 0.65}),
          style({transform : 'rotate(45deg) translate(-30%, 10%)', offset: 0.85}),
          style({transform : 'rotate(0deg) translate(0%, 0%)', offset: 1})
        ])
      )
    ])

  ])
]);