USE [UserManager]
GO
ALTER TABLE [dbo].[tblUser] DROP CONSTRAINT [FK_tblUser_tblRole]
GO
ALTER TABLE [dbo].[tblPromotionDetail] DROP CONSTRAINT [FK_tblPromotionDetail_tblPromotion]
GO
ALTER TABLE [dbo].[tblPromotion] DROP CONSTRAINT [FK_tblPromotion_tblUser]
GO
/****** Object:  Table [dbo].[tblUser]    Script Date: 6/21/2021 7:21:06 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblUser]') AND type in (N'U'))
DROP TABLE [dbo].[tblUser]
GO
/****** Object:  Table [dbo].[tblRole]    Script Date: 6/21/2021 7:21:06 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblRole]') AND type in (N'U'))
DROP TABLE [dbo].[tblRole]
GO
/****** Object:  Table [dbo].[tblPromotionDetail]    Script Date: 6/21/2021 7:21:06 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblPromotionDetail]') AND type in (N'U'))
DROP TABLE [dbo].[tblPromotionDetail]
GO
/****** Object:  Table [dbo].[tblPromotion]    Script Date: 6/21/2021 7:21:06 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[tblPromotion]') AND type in (N'U'))
DROP TABLE [dbo].[tblPromotion]
GO
/****** Object:  Table [dbo].[tblPromotion]    Script Date: 6/21/2021 7:21:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblPromotion](
	[promotionID] [nvarchar](100) NOT NULL,
	[userID] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_tblPromotion] PRIMARY KEY CLUSTERED 
(
	[promotionID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblPromotionDetail]    Script Date: 6/21/2021 7:21:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblPromotionDetail](
	[promotionDetailID] [int] IDENTITY(1,1) NOT NULL,
	[promotionID] [nvarchar](100) NOT NULL,
	[rank] [int] NULL,
	[userID] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_tblPromotionDetail] PRIMARY KEY CLUSTERED 
(
	[promotionDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblRole]    Script Date: 6/21/2021 7:21:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblRole](
	[roleID] [varchar](10) NOT NULL,
	[roleName] [nvarchar](100) NULL,
 CONSTRAINT [PK_tblRole] PRIMARY KEY CLUSTERED 
(
	[roleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblUser]    Script Date: 6/21/2021 7:21:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblUser](
	[userID] [nvarchar](100) NOT NULL,
	[userName] [nvarchar](100) NULL,
	[password] [varchar](100) NULL,
	[email] [nvarchar](100) NULL,
	[phone] [varchar](50) NULL,
	[photo] [varchar](max) NULL,
	[roleID] [varchar](10) NOT NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_tblUser] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[tblPromotion]  WITH CHECK ADD  CONSTRAINT [FK_tblPromotion_tblUser] FOREIGN KEY([userID])
REFERENCES [dbo].[tblUser] ([userID])
GO
ALTER TABLE [dbo].[tblPromotion] CHECK CONSTRAINT [FK_tblPromotion_tblUser]
GO
ALTER TABLE [dbo].[tblPromotionDetail]  WITH CHECK ADD  CONSTRAINT [FK_tblPromotionDetail_tblPromotion] FOREIGN KEY([promotionID])
REFERENCES [dbo].[tblPromotion] ([promotionID])
GO
ALTER TABLE [dbo].[tblPromotionDetail] CHECK CONSTRAINT [FK_tblPromotionDetail_tblPromotion]
GO
ALTER TABLE [dbo].[tblUser]  WITH CHECK ADD  CONSTRAINT [FK_tblUser_tblRole] FOREIGN KEY([roleID])
REFERENCES [dbo].[tblRole] ([roleID])
GO
ALTER TABLE [dbo].[tblUser] CHECK CONSTRAINT [FK_tblUser_tblRole]
GO
