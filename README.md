
### Event Driven

```java
        /**
         * 테스트 케이스
         * 1. @Transactional (O), @EventListener
         *  이벤트를 발행하기 전 업데이트를 하고 예외가 발생했을 때는, 이벤트 처리가 이루어지지 않는다.
         *  만약 이벤트 발행이 먼저 이루어지고 예외가 발생할 경우에는 이벤트 처리가 발생한다.
         *  트랜잭션 로직의 결과와 관계없이 이벤트 처리는 이루어지고 실패해도 이루어지기 때문에 정합성이 깨진다.
   
         * 2. @Transactional (O) @TransactionalEventListener
         *  트랜잭션 리스너는 트랜잭션이 걸려있는 로직에서 성공을 했을 떄 동작한다.
   
         * 3. @Transactional (X) @EventListener
         *  트랜잭션 여부와 관계없이 이벤트 처리가 이루어진다.
 
         * 4. @Transactional (X) @TransactionalEventListener
         *  트랜잭션이 걸려있는 로직에서 이벤트 발행이 이루어졌을 경우에만 이벤트 처리를 실행하기 떄문에
         *  어떤 상황에서도 동작하지 않는다.
         */
```