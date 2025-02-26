# 키친포스

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문 고객 수를 변경할 수 있다.
- 방문 고객 수가 올바르지 않으면 변경할 수 없다.
    - 방문 고객 수는 0 이상이어야 한다.
- 빈 테이블은 방문 고객 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 고객 | customer | 식당 주문을 이용하는 고객 (종류: 방문 고객, 포장 고객, 배달 고객) |
| 상품 | product | 매장에서 판매하는 음식, 음료 등의 물품 |
| 메뉴 상품 | menuProduct | 상품과 수량의 조합, 메뉴로 등록될 수 있는 단위 |
| 메뉴 | menu | 메뉴 상품 목록, 판매가 가능한 단위 (메뉴의 노출 여부를 제어할 수 있다.) |
| 메뉴 그룹 | menuGroup | 메뉴의 묶음 |
| 주문 테이블 | orderTable | 방문 고객이 사용하는 식당 내 테이블 (속성: 방문 고객 수) |
| 방문 고객 수 | numberOfGuests | 방문 고객의 인원 수, 주문 테이블을 이용하는 인원수 |
| 주문 | order | 주문 메뉴와 주문 방식의 조합, 고객이 식당에 하는 요청 |
| 주문 메뉴 | orderLineItem | 메뉴와 수량의 조합, 고객이 주문한 메뉴 항목 |
| 주문 유형 | orderType | 고객의 주문 방식 (종류: 매장 주문, 포장 주문, 배달 주문) |
| 매장 주문 | eatIn | 식당을 직접 방문해 이용하는 주문 유형 |
| 포장 주문 | takeout | 고객이 포장된 주문 메뉴를 매장에서 수령하도록 하는 주문 유형 |
| 배달 주문 | delivery | 고객이 포장된 주문 메뉴를 배달 주소에서 수령하도록 하는 주문 유형 |
| 배달 대행사 | deliveryAgency | 매장 고객이 요청한 배달 주소로 주문 메뉴를 배달하는 서비스 업체 |
| 주문 상태 | orderStatus | 주문이 준비된 상태 (종류: 대기, 접수, 서빙, 배달, 배달 완료, 주문 완료) |
| 대기 중 | waiting | 주문이 등록되어 매장의 접수를 기다리는 상태 |
| 접수 | accepted | 매장에서 주문을 확인하고 주문 메뉴를 준비하는 상태, 배달 주문이면 배달 대행사를 호출한다. |
| 서빙 | served | 주문 메뉴가 준비 완료된 상태 (매장/포장 주문인 경우 고객, 배달 주문인 경우 배달 대행사를 기다리는 상태) |
| 배달 중 | delivering | 배달 대행사가 주문 메뉴를 배달 주소로 배달하고 있는 상태 |
| 배달 완료 | delivered | 배달 주소에 주문 메뉴 배달이 완료된 상태 |
| 주문 완료 | completed | 주문 메뉴가 고객에게 전달된 상태 |


## 모델링
### 상품(`Product`)
- 속성
  - 상품은 식별자, 상품 이름(`name`), 상품 가격(`price`)을 가진다.

- 기능
  - 상품을 등록한다.(`create`)
    - 상품의 가격(`price`)은 0원 이상이어야 한다.
    - 상품의 이름(`name`)에는 비속어가 포함되지 않아야 한다. 
  - 상품의 가격을 변경한다.(`chnagePrice`)
    - 상품의 가격(`price`)은 0원 이상이어야 한다.
    - 메뉴 상품 목록(`menuProducts`)의 가격 합계가 메뉴의 가격(`price`) 이하이면 메뉴가 숨겨진다.
  - 상품 목록을 조회한다.(`findAll`)

### 메뉴 그룹(`MenuGroup`)
- 속성
  - 메뉴 그룹은 식별자, 메뉴 그룹 이름(`name`)을 가진다.
  
- 기능
  - 메뉴 그룹을 등록(`create`)한다.
    - 메뉴 그룹의 이름(`name`)은 비어있지 않아야 한다.
  - 메뉴 그룹 목록을 조회한다.(`findAll`)

### 메뉴(`Menu`)
- 속성
  - 메뉴는 식별자, 메뉴 이름(`name`), 메뉴 가격(`price`)을 가진다.
  - 메뉴는 메뉴 그룹(`MenuGroup`), 메뉴 상품 목록(`menuProducts`)을 가진다.
  - 메뉴는 메뉴 노출 여부(`displayed`)를 가진다.

- 기능
  - 메뉴를 등록한다.(`create`)
    - 메뉴 상품 목록(`menuProducts`)이 비어있지 않아야 한다.
    - 상품(`Product`)이 등록되어 있어야 한다.
    - 메뉴 상품(`menuProduct`)의 수량이 0 이상이어야 한다.
    - 메뉴 그룹(`MenuGroup`)이 비어있지 않아야 한다.
    - 메뉴의 가격(`price`)이 0원 이상이어야 한다.
    - 메뉴의 가격(`price`)은 메뉴 상품 목록(`menuProducts`)의 가격 합계보다 작아야 한다.
    - 메뉴의 이름(`name`)에는 비속어가 포함되지 않아야 한다.
  - 메뉴의 가격을 변경한다.(`chnagePrice`)
    - 메뉴의 가격(`price`)이 0원 이상이어야 한다.
    - 메뉴의 가격(`price`)은 메뉴 상품 목록(`menuProducts`)의 가격 합계보다 작아야 한다.
  - 메뉴를 노출한다.(`display`)
    - 메뉴의 가격(`price`)은 메뉴 상품 목록(`menuProducts`)의 가격 합계보다 작아야 한다.
  - 메뉴를 숨긴다.(`hide`)
  - 메뉴 목록을 조회한다.(`findAll`)

### 주문 테이블(`OrderTable`)
- 속성
  - 주문 테이블은 식별자, 테이블 이름(`name`), 방문 고객 수(`numberOfGuests`)를 가진다.
  - 주문 테이블은 빈 테이블 여부(`empty`)를 가진다.
  
- 기능
  - 주문 테이블을 등록한다.(`create`)
    - 주문 테이블의 이름(`name`)이 비어있지 않아야 한다.
  - 주문 테이블을 빈 테이블에서 해지한다.(`sit`)
  - 주문 테이블을 빈 테이블로 설정한다.(`clear`)
    - 주문(`Order`)이 완료된 상태이어야 한다.
  - 주문 테이블의 방문 고객 수(`numberOfGuests`)를 변경한다.
    - 방문 고객 수(`numberOfGuests`)는 0 이상이어야 한다.
    - 빈 테이블이지 않아야 한다.
  - 주문 테이블 목록을 조회한다.(`findAll`)

### 주문(`Order`)
- 속성
  - 주문은 식별자, 주문 유형(`orderType`), 주문 상태(`orderStatus`), 주문 시간(`orderDateTime`)을 가진다.
  - 주문은 주문 메뉴 목록(`orderLineItems`), 배달 주소(`deliveryAddress`), 주문 테이블(`OrderTable`)을 가진다.

- 기능
  - 매장 주문을 등록한다.(`create`)
    - 주문 유형(`orderType`)이 매장 주문(`eatIn`), 포장 주문(`takeout`), 배달 주문(`delivery`) 중 하나이어야 한다.
    - 주문 메뉴 목록(`orderLineItems`)이 비어있지 않아야 한다.
    - 주문 메뉴(`orderLineItem`)가 등록되어 있어야 한다.
    - 주문 메뉴(`orderLineItem`)의 수량이 0 이상이어야 한다.
      - 매장 주문(`eatIn`)은 0 미만일 수 있다.
    - 매장 주문(`eatIn`)은 주문 테이블(`OrderTable`)이 빈 테이블이 아니어야 한다.
    - 배달 주문(`delivery`)은 배달 주소(`deliveryAddress`)가 비어있지 않아야 한다.
    - 메뉴(`Menu`)의 노출 여부(`displayed`)가 숨겨진 상태(`false`)이면 등록할 수 없다.
    - 주문 메뉴(`orderLineItem`)의 가격은 등록된 메뉴의 가격과 일치해야 한다.
  - 주문을 접수한다.(`accept`)
    - 대기 중(`waiting`) 상태여야 한다.
    - 배달 주문(`delivery`)이면 배달 대행사(`deliveryAgency`)를 호출한다.
  - 주문을 서빙한다.(`serve`)
    - 접수(`accepted`) 상태여야 한다.
  - 주문을 배달한다.(`startDelivery`)
    - 배달 주문(`delivery`)이어야 한다.
    - 서빙(`served`) 상태여야 한다.
  - 주문을 배달 완료한다.(`completeDelivery`)
    - 배달 중(`delivering`) 상태여야 한다.
  - 주문을 완료한다.(`complete`)
    - 매장(`eatIn`) 및 포장(`takeout`) 주문이면 서빙(`served`) 상태여야 한다.
    - 배달 주문(`delivery`)이면 배달 완료(`delivered`) 상태여야 한다.
    - 매장(`eatIn`) 주문이면 주문 테이블(`OrderTable`)을 빈 테이블로 설정 및 방문 고객 수(`numberOfGuests`)를 0으로 변경한다.
  - 주문 목록을 조회한다.(`findAll`)

#### 매장 주문(`eatIn`)
```mermaid
sequenceDiagram
    actor Admin 
    autonumber
		Admin ->> System : 주문 테이블 선택 및 방문 고객 수 지정
		Admin ->> System : 주문 요청
		Admin ->> System : 주문 수락
		Admin ->> System : 준비 완료
		Admin ->> System : 주문 완료
        Admin ->> System : 빈 테이블 설정 및 방문 고객 수 0으로 변경
```

#### 포장 주문(`takeout`)
```mermaid
sequenceDiagram
	actor Customer
    actor Admin
    autonumber
		Admin->> System : 주문 요청
		Admin ->> System : 주문 수락
		Admin ->> System : 준비 완료
		Admin -->> Customer : 주문 메뉴 전달
		Admin ->> System : 주문 완료
```

#### 배달 주문(`delivery`)
```mermaid
sequenceDiagram
    actor Admin 
    autonumber
		Admin->> System : 주문 요청
		Admin ->> System : 주문 수락
		System -->> Delivery Agency : 호출
		Admin ->> System : 준비 완료
		Delivery Agency ->> System : 배달 시작
		Delivery Agency ->> System : 배달 완료
		Admin ->> System : 주문 완료
```
