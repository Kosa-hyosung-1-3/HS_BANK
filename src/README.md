## 📁 디렉터리 구조

```
📁 internet-banking
 ├──── 📁 .github
 │      ├──── 📁 ISSUE_TEMPLATE
 │      │      ├──── 📄 ✅-feature-request.md
 │      │      └──── 📄 🐞-hotfix-report.md
 │      └──── 📄 PULL_REQUEST_TEMPLATE
 ├──── 📁 bin
 ├──── 📁 src
 │      ├──── 📁 dto
 │      │      ├──── 📁 account
 │      │      │      │──── 📁 request
 │      │      │      │      └──── 📄 RegisterAccountDto.java
 │      │      │      └──── 📁 response
 │      │      │             └──── 📄 GetAccountDto.java
 │      │      ├──── 📁 inquiry
 │      │      │      ├──── 📄 EditInquiryDto.java
 │      │      │      ├──── 📄 GetInquiryDto.java
 │      │      │      ├──── 📄 GetInquiryListDto.java
 │      │      │      └──── 📄 RegisterInquiryDto.java
 │      │      ├──── 📁 transaction
 │      │      │      └──── 📁 request
 │      │      │             └──── 📄 GetTransactionDto.java
 │      │      └──── 📁 user
 │      │             ├──── 📁 adimin
 │      │             ├──── 📁 client
 │      │             │      ├──── 📄 GetClientDto.java
 │      │             │      ├──── 📄 GetCurrentClientDto.java
 │      │             │      └──── 📄 UpdateClientDto.java
 │      │             ├──── 📄 LoginDto.java
 │      │             └──── 📄 RegisterUserDto.java
 │      ├──── 📁 entity
 │      │      ├──── 📄 Account.java
 │      │      ├──── 📄 Admin.java
 │      │      ├──── 📄 Client.java
 │      │      ├──── 📄 Inquiry.java
 │      │      ├──── 📄 Transaction.java
 │      │      └──── 📄 User.java
 │      ├──── 📁 exception
 │      │      ├──── 📄 AccountAlreadyExistsException.java
 │      │      ├──── 📄 BalanceInsufficientException.java
 │      │      ├──── 📄 ClientNotFoundException.java
 │      │      ├──── 📄 DataLoadingException.java
 │      │      ├──── 📄 DataSavingException.java
 │      │      ├──── 📄 EmptyAccountListException.java
 │      │      ├──── 📄 EmptyInquiryListException.java
 │      │      ├──── 📄 EmptyTransactionListException.java
 │      │      ├──── 📄 ExistingUserException.java
 │      │      ├──── 📄 IncorrectCredentialsException.java
 │      │      └──── 📄 InquiryNotFoundException.java    
 │      ├──── 📁 repository
 │      │      ├──── 📄 AccountRepository.java
 │      │      ├──── 📄 AdminRepository.java
 │      │      ├──── 📄 ClientRepository.java
 │      │      ├──── 📄 InquiryRepository.java
 │      │      ├──── 📄 Repository.java 
 │      │      └──── 📄 TransactionRepository.java
 │      ├──── 📁 service
 │      │      ├──── 📄 AccountService.java
 │      │      ├──── 📄 AdminService.java
 │      │      ├──── 📄 ClientService.java
 │      │      ├──── 📄 InquiryService.java
 │      │      ├──── 📄 LoginService.java
 │      │      └──── 📄 TransactionService.java
 │      ├──── 📁 utils
 │      │      └──── 📄 DateUtils.java 
 │      ├──── 📁 view
 │      │      ├──── 📄 AdminView.java
 │      │      ├──── 📄 ClientView.java
 │      │      ├──── 📄 InitialView.java
 │      │      ├──── 📄 LoginView.java
 │      │      └──── 📄 View.java
 │      └──── 📄 Application.java
 │──── 📁 Referenced Libraries
 │      └──── 📄 lombok.jar
 │──── 📄 .classpath
 │──── 📄 .gitignore
 └──── 📄 .project
```