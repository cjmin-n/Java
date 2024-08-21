## 선생님

# Application
- 스캐너로 이름, id 받기 -> Customer 생성자로 전체초기화
- 제품 목록 생성 ArrayList
- while 무한루프
    1. 제품목록 조회 - for 향상문으로 제품명+가격+재고 출력
    2. 제품 주문 - Order 인스턴스 선언 - while 무한루프 -> "끝" 받으면 중지
    -  Product selectedProduct = null;                              ** Product 객체를 다른 변수명으로 받아서 주문 리스트 비교 ! 
    - for 향상문으로 입력한 이름과 제품 이름이 같으면
    - selectedProduct = product;
    - null 이 아니면 주문 수량 입력받고 / null 이면 찾을 수 없다고 안내
    - selectedProduct.isInstock(quantity)가 참이면
    - selectedProduct.reduceStock(quantity) 실행, OrderItem 에 selectedProduct, quantity 전체초기화
    - order.addItem(item)                     - >OrderItem 리스트에넣고
    - customer.addOrder(order);                 ->Order 주문리스트에 넣고
    3. 주문내역 조회
    - customer.viewOrders();                     
    4. 종료

# Customer
- 변수 선언
  private String name; // 고객 이름
  private String customerId; // 고객 ID
  private ArrayList<Order> orders; // 주문 리스트
- Customer 전체 초기화 함수
- 주문 추가 메소드 addOrder(Order order) - orders.add(order);
- 주문 내역 조회 메소드 viewOrders() - for 향상문 Orders order.listOrderItems(); total+= order.calculateTotalAmount()

# Order
- 변수 선언
  private ArrayList<OrderItem> items;
- 기본 생성자에 ArrayList 초기화
- 주문 추가 메소드 -> addItem(OrderItem item) - items.add(item);
- 전체 주문 금액 계산 메소드 -> double calculateTotalAmount() -> OrderItem item - total+= item.calculateTotalPrice(); return total;
- 총 주문 조회 -> listOrderItems() -> for 향상문 OrderItem item 조회

# OrderItem
- 변수 선언
  private Product product; // 주문된 제품
  private int quantity; // 주문 수량
- 전체 초기화 생성자
- 주문한 제품의 총가격 double calculateTotalPrice() return product.getPrice*quantity;
- String getProductName -> return name
- int getQuantity => quantity;

# Product
- 변수선언
  private String name; // 제품 이름
  private double price; // 제품 가격
  private int stock; // 재고 수량
- getter Setter
- 재고확인 boolean isInStock(int quantity) return stock >= quantity;
- 재고감소 reduceStock(int quantity) -> if(isInStock(quntity)) -> stock-= quantity;



## 나
# Application
- 제품 리스트 만들기
- name, id 받아서 customer 전체초기화
- while 무한루프
    1. 제품목록조회 -> for문
    2. for문 제품 이름, 수량 받아서 productList에서 같은 제품 찾아서 해당 인덱스 넘겨주기 - 해당 넘버의 product 객체를 만들기 customer.addOrder(product, amount) -> amount!=pAmount 이면 product 에 setAmount(pAmount)
    3. customer.viewOrder();
    4. 종료

# Customer
- 변수선언
    -  private String cName; // 고객 이름
       private String id; // 아이디                     ** 주문 리스트 속성 없음 **
- 전체초기화 생성자 함수
- int addOrder(Product product, int amount) -> pAmount에 product.getAmount() -> pAmount가 같거나 크면 구매성공 +남은수량 알려주기 order.listUp(product, amount) 넘겨주기 - return pAmount;
- viewOrder() -> order.viewUp()이 참이 아니면 주문내역 x 참이면 total=order.total 총금액은 total 입니다.

# Order
- 변수선언
  ArrayList<Product> orderList = new ArrayList<>();         ** 주문 리스트 없음 ! **
  OrderItem orderItem = new OrderItem();
  int total;
- listUp(Product product, int amount) - orderList.add(product) / total+= orderItem.total(product, amount);
- boolean viewUp() -> orderList.isEmpty() 이면 return false; 아니면 주문 내역 보여주고 return true;

# OrderItem
                                            ** 주문된 제품과 수량 속성 빼먹음 ! ! **
- int total(Product product, int amount) -> total=price*amount - return total;

# Product
- 변수선언
  private String pName; // 제품 이름
  private int price; // 제품 가격
  private int amount; // 수량
- 전체 생성자 초기화
- getter Setter
- toString